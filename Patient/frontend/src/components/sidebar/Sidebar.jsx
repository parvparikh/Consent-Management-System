import "./sidebar.css";
import {
  LineStyle,
  Timeline,
  TrendingUp,
  PermIdentity,
  Storefront,
  AttachMoney,
  BarChart,
  MailOutline,
  DynamicFeed,
  ChatBubbleOutline,
  WorkOutline,
  Report,
  // VerifiedIcon
} from "@mui/icons-material";
import PendingIcon from '@mui/icons-material/Pending';
import AssignmentTurnedInIcon from '@mui/icons-material/AssignmentTurnedIn';
import AssignmentIcon from '@mui/icons-material/Assignment';
import VerifiedIcon from '@mui/icons-material/Verified';
import HistoryIcon from '@mui/icons-material/History';
import { Link } from "react-router-dom";

export default function Sidebar() {
  const buttonClickHandler = (e) => {
    let elem = document.querySelector('li.active');
    elem.classList.remove('active');
    e.currentTarget.classList.add('active');
};
  return (
    <div className="sidebar">
      <div className="sidebarWrapper">
        <div className="sidebarMenu">
          <h4 className="sidebarTitle1">Patient Dashboard</h4>
          <ul className="sidebarList">
            <Link to="/" className="link">
            <li  className="sidebarListItem active" onClick={buttonClickHandler} >
              <PendingIcon className="sidebarIcon" />
              Pending Requests
            </li>
            </Link>
            <Link to="/" className="link">
            <li className="sidebarListItem">
              <AssignmentTurnedInIcon className="sidebarIcon" />
              Active Consents
            </li>
            </Link>
            <li className="sidebarListItem">
              <HistoryIcon className="sidebarIcon" />
              Logs
            </li>
            <Link to="/medicalhistory" className="link">
            <li className="sidebarListItem"  onClick={buttonClickHandler}>
              <AssignmentIcon className="sidebarIcon" />
              
              Medical Records
            </li>
            </Link>
            <li className="sidebarListItem">
              <VerifiedIcon className="sidebarIcon" />
              Voluntary Consents
            </li>
          </ul>
        </div>
        {/* <div className="sidebarMenu">
          <h3 className="sidebarTitle">Medical</h3>
          <ul className="sidebarList">
            <Link to="/users" className="link">
              <li className="sidebarListItem">
                <PermIdentity className="sidebarIcon" />
                Users
              </li>
            </Link>
            <Link to="/products" className="link">
              <li className="sidebarListItem">
                <Storefront className="sidebarIcon" />
                Products
              </li>
            </Link>
            <li className="sidebarListItem">
              <AttachMoney className="sidebarIcon" />
              Transactions
            </li>
            <li className="sidebarListItem">
              <BarChart className="sidebarIcon" />
              Reports
            </li>
          </ul>
        </div> */}
        {/* <div className="sidebarMenu">
          <h3 className="sidebarTitle">Notifications</h3>
          <ul className="sidebarList">
            <li className="sidebarListItem">
              <MailOutline className="sidebarIcon" />
              Mail
            </li>
            <li className="sidebarListItem">
              <DynamicFeed className="sidebarIcon" />
              Feedback
            </li>
            <li className="sidebarListItem">
              <ChatBubbleOutline className="sidebarIcon" />
              Messages
            </li>
          </ul>
        </div>
         */}
      </div>
    </div>
  );
}
