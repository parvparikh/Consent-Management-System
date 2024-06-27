import "./featuredInfo.css";

export default function FeaturedInfo() {
  return (
    <div className="featured">
      <div className="featuredItem">
        <span className="featuredTitle">Total Consents</span>
        <div className="featuredMoneyContainer">
          <span className="featuredMoney blue" >25</span>
         
        </div>
      </div>
      <div className="featuredItem">
        <span className="featuredTitle">Total Active Consents</span>
        <div className="featuredMoneyContainer">
          <span className="featuredMoney green">15</span>
          
        </div>
      </div>
      <div className="featuredItem">
        <span className="featuredTitle">Total Revoked Consent</span>
        <div className="featuredMoneyContainer">
          <span className="featuredMoney red">10</span>
          
        </div>
      </div>
      <div className="featuredItem">
        <span className="featuredTitle">Pending Requests</span>
        <div className="featuredMoneyContainer">
          <span className="featuredMoney ">5</span>
         
        </div>
      </div>
    </div>
  );
}
