import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import NavBar from './Components/NavBar';
import { BrowserRouter,Routes,Route } from 'react-router-dom';
import ShowTemplates from './Components/ShowTemplates'
import InProgressIssues from './Components/InProgressIssues'
import LeftIssues from './Components/LeftIssues'
import CompletedIssues from './Components/CompletedIssues'
import CreateIssue from './Components/CreateIssue'
import Home from './Components/Home'
import SearchCountry from './Components/SearchCountry';
import { useState } from 'react';
import Selector from './Components/Selector';

function App() {
  const [country,setCountry]=useState("India")
  
  return (
    <>
      <NavBar/>
        <div className='container'>
          <Routes>
              <Route path="/" element={<Home/>}></Route>
              <Route path="/showTemplates" element={<ShowTemplates />}></Route>
              <Route path="/leftIssues" element={<LeftIssues/>}></Route>
              <Route path="/inProgressIssues" element={<InProgressIssues/>}></Route>
              <Route path="/createIssues" element={<CreateIssue country={country}/>}></Route>
              <Route path="/completedIssues" element={<CompletedIssues/>}></Route>
              <Route path="/selectCountry" element={<Selector setCountry={setCountry}/>}></Route>
          </Routes>
        </div>
    </>
  )
}

export default App;
