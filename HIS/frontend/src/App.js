import Sidebar from "./components/sidebar/Sidebar";
import Topbar from "./components/topbar/Topbar";
import "./App.css";
import Home from "./pages/home/Home";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";

import GeneratePrescription from "./pages/generateprescription/GeneratePrescription";

function App() {
  return (
    <Router>
      <Topbar />
      <div className="container">
        <Sidebar />
        <div className="moveright">
        <Routes>
          <Route exact path="/" element={<GeneratePrescription/>}/>
          <Route exact path="/generateprescription" element={<GeneratePrescription/>}/>
          {/* <Route path="/users" element={<UserList />}/>     
          <Route path="/user/:userId" element={<User />}/>
          <Route path="/newUser" element={<NewUser />}/>
          <Route path="/products" element={ <ProductList />}/>
          <Route path="/product/:productId" element={<Product />}/>
          <Route path="/newproduct" element={<NewProduct />}/> */}
        </Routes> 
        </div>
      </div>
    </Router>
  );
}

export default App;
