import { Button } from "@mui/material";
import "./widgetLg.css";
import SendIcon from '@mui/icons-material/Send';
import CalendarMonthIcon from '@mui/icons-material/CalendarMonth';
import DisabledByDefaultIcon from '@mui/icons-material/DisabledByDefault';
export default function WidgetLg() {
  const Buttons = ({ type }) => {
    return <button className={"widgetLgButton " + type}>{type}</button>;
  };
  return (
    <div className="widgetLg">
      <h3 className="widgetLgTitle">Pending Requests</h3>
      <table className="widgetLgTable">
        <tr className="widgetLgTr">
          <td className="widgetLgUser">
            
            <span className="widgetLgName">Dr. Madhugandha Chavan<br/><span className="widgetLgsubname">Kauvery Hospital</span></span>
          </td>
          <td className="widgetLgDate">
            <CalendarMonthIcon className="calender-icon"/>
          <span className="calender-date">25-02-2016</span><br/>
          <span className="between">To<br/></span>
          <CalendarMonthIcon className="calender-icon"/> 
          <span className="calender-date">25-04-2020</span>
          </td>
          <td className="widgetLgAmount">
                  <div className="tags"><Button className="btn" variant="outlined">Nausea</Button></div>
                  <div className="tags" ><Button className="btn" variant="outlined">Cold</Button></div>
                  <div className="tags"><Button className="btn"variant="outlined">Cough</Button></div>


          </td>
          <td>Reason :<br/> Need to view past records for the diagnosis

          </td>
          <td className="widgetLgStatus">
            <div className="view-btn">
          <Button className="btn" variant="outlined"  endIcon={<SendIcon />}>
        View
      </Button></div>
      <div className="reject-btn">
      <Button className="btn" variant="contained" color="error" endIcon={<DisabledByDefaultIcon />}>
        Reject
      </Button>
      </div>
          </td>
        </tr  >


<tr><hr/></tr>

        <tr className="widgetLgTr">
          <td className="widgetLgUser">
            
            <span className="widgetLgName">Dr. Jacob Mathew<br/><span className="widgetLgsubname">BGM Hospital</span></span>
          </td>
          <td className="widgetLgDate">
            <CalendarMonthIcon className="calender-icon"/>
          <span className="calender-date">25-02-2010</span><br/>
          <span className="between">To<br/></span>
          <CalendarMonthIcon className="calender-icon"/> 
          <span className="calender-date">25-04-2015</span>
          </td>
          <td className="widgetLgAmount">
                  <div className="tags"><Button className="btn" variant="outlined">Sinusitis</Button></div>
                  <div className="tags" ><Button className="btn" variant="outlined">Cold</Button></div>
                  <div className="tags"><Button className="btn"variant="outlined">Headache</Button></div>


          </td>
          <td>Reason :<br/> Need to view past records for the diagnosis

          </td>
          <td className="widgetLgStatus">
            <div className="view-btn">
          <Button className="btn" variant="outlined"  endIcon={<SendIcon />}>
        View
      </Button></div>
      <div className="reject-btn">
      <Button className="btn" variant="contained" color="error" endIcon={<DisabledByDefaultIcon />}>
        Reject
      </Button>
      </div>
          </td>
        </tr  >
     
        
      </table>
    </div>
  );
}
