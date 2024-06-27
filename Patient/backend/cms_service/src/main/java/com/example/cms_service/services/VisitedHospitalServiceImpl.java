package com.example.cms_service.services;//package com.example.backend.services;
//
import com.example.cms_service.otherclasses.FinalRecords;
import com.example.cms_service.otherclasses.MedicalRecord;
import com.example.cms_service.response.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class VisitedHospitalServiceImpl implements VisitedHospitalDetailsService {
//  @Autowired
    private RestTemplate restTemplate_admin;
    private RestTemplate restTemplate_his;

    private String hisBaseURL;
    public VisitedHospitalServiceImpl(@Value("${admin_service.base.url}")String adminBaseURL,RestTemplateBuilder builder){
       this.restTemplate_admin= builder.rootUri(adminBaseURL).build();
       this.restTemplate_his=builder.build();
    }

 public MedicalRecordResponse VisitedHospitals(String pid){
                EntityResponse entityResponse =new EntityResponse();
                HospitalResponse hospitalResponse =new HospitalResponse();
                RecordResponse recordResponse =new RecordResponse();
                MedicalRecordResponse medicalRecordResponse =new MedicalRecordResponse();

                List<HospitalResponse> hospitalResponseList=new ArrayList<>();
                List<FinalRecords> finalRecordsList=new ArrayList<>();
                //set data by making a rest api call
                 entityResponse= restTemplate_admin.getForObject("/getVisitedHospitalDetails/{pid}", EntityResponse.class ,pid);
                 List<AdminResponse> adminResponse =entityResponse.getEntityRegs();

                 for (final AdminResponse  d : adminResponse) {
                    hisBaseURL="http://"+d.getEip()+":"+d.getPort()+"/his_end/api";
//                    System.out.println(hisBaseURL);
                    hospitalResponse= restTemplate_his.getForObject(hisBaseURL+"/getRecords/{pid}", HospitalResponse.class ,pid);
//                    System.out.println(hospitalResponse.toString());
                    hospitalResponse.setEid(d.getEid());
                    hospitalResponse.setEname(d.getEname());
                    hospitalResponse.setEtype(d.getEtype());
//                    System.out.println(hospitalResponse.toString());

                    hospitalResponseList.add((HospitalResponse) hospitalResponse);
                 }
                 recordResponse.setHospitalResponses(hospitalResponseList);
                 recordResponse.setPid(pid);
//                System.out.println(recordResponse.toString());

                 List<HospitalResponse> hospitalResponses =hospitalResponseList;
                for (final HospitalResponse  d : hospitalResponses) {
                    for(final MedicalRecord m : d.getMedicalRecordEntities()) {
                        FinalRecords finalRecords=new FinalRecords();
                        finalRecords.setDid(m.getDoctorEntity().getDid());
                        finalRecords.setDname(m.getDoctorEntity().getDname());
//                        System.out.println(finalRecords.getDname());
                        finalRecords.setEid(d.getEid());
//                        System.out.println(finalRecords.getEid());
                        finalRecords.setEtype(d.getEtype());
//                        System.out.println(finalRecords.getEtype());
                        finalRecords.setEname(d.getEname());
//                        System.out.println(finalRecords.getEname());
                        finalRecords.setRid(m.getRid());
//                        System.out.println(finalRecords.getRid());

                        finalRecords.setDesc(m.getDescription());
//                        System.out.println(finalRecords.getDesc());
                        finalRecords.setTags(m.getTags());
//                        System.out.println(finalRecords.getTags());
                        finalRecords.setGen_date(m.getGen_date());
                        finalRecords.setRec_type(m.getType());
                        System.out.println(finalRecords.toString());
                        finalRecordsList.add((FinalRecords) finalRecords);
                      }



                }

                 medicalRecordResponse.setFinalRecordsList(finalRecordsList);
//                    System.out.println(medicalRecordResponse.toString());
                 return  medicalRecordResponse;

//                 return entityResponse;
 }


}
