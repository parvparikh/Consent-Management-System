import axios from "axios";

const CMS_API_BASE_URL = "http://localhost:8084/cms_end/api";

class MedicalRecordsService {
//   saveEmployee(employee) {
//     return axios.post(EMPLOYEE_API_BASE_URL, employee);
//   }

//   getEmployees() {
//     return axios.get(EMPLOYEE_API_BASE_URL);
//   }

//   deleteEmployee(id) {
//     return axios.delete(EMPLOYEE_API_BASE_URL + "/" + id);
//   }

getMedicalRecordsId(id) {
    return axios.get(CMS_API_BASE_URL + "/getMedicalRecords/" + id);
  }

//   updateEmployee(employee, id) {
//     return axios.put(EMPLOYEE_API_BASE_URL + "/" + id, employee);
//   }
}
const m=new MedicalRecordsService()
export default m ;