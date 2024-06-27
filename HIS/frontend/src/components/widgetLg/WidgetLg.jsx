import { Button } from "@mui/material";
import "./widgetLg.css";
// import SendIcon from '@mui/icons-material/Send';
// import CalendarMonthIcon from '@mui/icons-material/CalendarMonth';
// import DisabledByDefaultIcon from '@mui/icons-material/DisabledByDefault';
export default function WidgetLg() {
  const Buttons = ({ type }) => {
    return <button className={"widgetLgButton " + type}>{type}</button>;
  };
  return (
    <div className="widgetLg">
    Patient ID : 
    Vitals :
    Observation :
    
      
    </div>
  );
}
