import React, { useState } from "react";
// import { useNavigate } from "react-router-dom";
// import EmployeeService from "../services/EmployeeService";
import FormControlLabel from '@mui/material/FormControlLabel';
import Checkbox from '@mui/material/Checkbox';
import TextField from '@mui/material/TextField';
import Button from '@mui/material/Button';
const AddRecords = () => {
  const [records, setRecords] = useState({
    pid: "",
    did: "D03",
    tag1: "",
    tag2:"",
    tag3:"",
    type: "Prescription",
    gen_date:"",
    vitals:"",
    obser:"", 
    presc:"",
    diagnosis:""


  });

//   const navigaye = useNavigate();

  const handleChange = (e) => {
    const value = e.target.value;
    setRecords({ ...records, [e.target.name]: value });
  };

  const saveRecords= (e) => {
    e.preventDefault();
    console.log(records)
    let result= {pid: records.pid,
    did: "D03",
    tag: records.tag1+" | "+records.tag2+" | "+records.tag3,
    type: "Prescription",
    gen_date:records.gen_date,
    desc:"Vitals : \n"+records.vitals+"<br/>\n Observation : \n"+records.obser+"<br/>\nDiagnosis : \n"+records.diagnosis+"\n<br/> "+}
  };
//   const saveEmployee = (e) => {
//     e.preventDefault();
//     EmployeeService.saveEmployee(employee)
//       .then((response) => {
//         console.log(response);
//         // navigaye("/employeeList");
//       })
//       .catch((error) => {
//         console.log(error);
//       });
//   };

  const reset = (e) => {
    e.preventDefault();
    setRecords({
        pid: "",
        did: "D03",
        tag1: "",
        tag2:"",
        tag3:"",
        type: "Prescription",
        gen_date:"",
        vitals:"",
        obser:"",
        presc:"",
        diagnosis:""
        });
  };

  return (
    <div className="widgetLg">
    <div className="flex max-w-2xl mx-auto shadow border-b">
      <div className="px-8 py-8">
        
        <div className="items-center justify-center h-14 w-full my-4">
          
          <TextField id="outlined-basic" label="Patient ID" variant="outlined" name="pid"
            value={records.pid}
            onChange={(e) => handleChange(e)}/>
          
        </div>
        <br/>
        <div className="items-center justify-center h-14 w-full my-4 three_tags">
          
          <TextField id="outlined-basic" label="Tag-1" variant="outlined"
            name="tag1"
            value={records.tag1}
            onChange={(e) => handleChange(e)}
            className="tagged" />
           <TextField id="outlined-basic" label="Tag-2" variant="outlined"
            name="tag2"
            value={records.tag2}
            onChange={(e) => handleChange(e)}
            className=" tagged" sx={{marginLeft:5}}/>
            <TextField id="outlined-basic" label="Tag-3" variant="outlined"
            name="tag3" sx={{marginLeft:5}}
            value={records.tag3}
            onChange={(e) => handleChange(e)}
            className="tagged"/>
        </div>
        <br/>
        
      
        <div className="items-center justify-center h-14 w-full my-4">
         
           <TextField id="outlined-basic" label="Vitals" variant="outlined"
            name="vitals"
            value={records.vitals}
            onChange={(e) => handleChange(e)}
            className="h-10 w-96 border mt-2 px-2 py-2"/>
        </div>
        <br/>
        <div className="items-center justify-center h-14 w-full my-4">
          
          <TextField
        id="date"
        label="Date"
        type="date"
        defaultValue="yyyy-mm-dd"
        name="gen_date"
        value={records.gen_date}
        onChange={(e) => handleChange(e)}
        sx={{ width: 220 }}
        InputLabelProps={{
          shrink: true,
        }}
      />
         
         
        </div>
        <br/>
        <div className="items-center justify-center h-14 w-full my-4">
        
          <TextField id="outlined-basic" label="Observation" variant="outlined"
            name="obser"
            value={records.obser}
            onChange={(e) => handleChange(e)}
            className="h-10 w-96 border mt-2 px-2 py-2"/>
        </div>
        <br/>
        <div className="items-center justify-center h-14 w-full my-4">
         
           <TextField id="outlined-basic" label="Prescription" variant="outlined"
            name="presc"
            value={records.presc}
            onChange={(e) => handleChange(e)}
            className="h-10 w-96 border mt-2 px-2 py-2"/>
        </div>
        <br/>
        <div className="items-center justify-center h-14 w-full my-4">
          
          <TextField id="outlined-basic" label="Diagnosis" variant="outlined"
            name="diagnosis"
            value={records.diagnosis}
            onChange={(e) => handleChange(e)}
            className="h-10 w-96 border mt-2 px-2 py-2"/>
        </div>
        <br/>
        <div> 
             <FormControlLabel control={<Checkbox  />} label="I hereby declare that this prescription is generated by me and can be used to dispense the medicine that I am prescribing for the allotted duration and dosage." />
             <br/>
             <div className="items-center justify-center h-14 w-full my-4 space-x-4 pt-4">
             <br/>
          <Button variant="contained"  color="success" onClick={saveRecords}>
                  Generate
          </Button>
          
          <Button variant="outlined"  sx={{marginLeft:2}}   onClick={reset}>
          Clear
          </Button>
          
        </div>
        </div>
        
      </div>
    </div>
    </div>
  );
};

export default AddRecords;