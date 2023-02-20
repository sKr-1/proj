import { useState } from 'react';
import Button from 'react-bootstrap/Button';
import Form from 'react-bootstrap/Form';
import { useLocation,Route} from "react-router-dom";
import {Home} from '../Components/Home'



function CreateIssue(arg) {
    const location = useLocation();
    const state = location.state;
    const [issueName,setIssueName]=useState(state.issueName)
    const [category,setCategory]=useState(state.category)
    const [title,setTitle]=useState(state.title)
    const [description,setDescription]=useState(state.description)
    const [assignedFolder,setAssignedFolder]=useState(state.assignedFolder)

    const raiseIssue=(e)=>{
        e.preventDefault()
        const countryName=arg.country;
        console.log(countryName)
        const sim={countryName,issueName,category,title,description,assignedFolder}
        fetch('http://localhost:8081/createIssue',{
            method:"POST",
            headers:{"Content-Type":"application/json"},
            body:JSON.stringify(sim)
        }).then(()=>{console.log("issue created")});
    }

    
  
  return (
    <>
    <Form >
      <Form.Group className="mb-3" controlId="formBasicEmail" id='title'>
        <Form.Label>Country</Form.Label>
        <Form.Control disabled={true} type="text" placeholder="Enter title" defaultValue={arg.country} />
      </Form.Group>

      <Form.Group className="mb-3" controlId="formBasicEmail" id='title'>
        <Form.Label>Issue Name</Form.Label>
        <Form.Control disabled={true} type="text" placeholder="Enter title" defaultValue={state.issueName} onChange={(e)=>setIssueName(e.target.value)}/>
      </Form.Group>

      <Form.Group className="mb-3" controlId="formBasicEmail" id='title'>
        <Form.Label>Category</Form.Label>
        <Form.Control disabled={true} type="text" placeholder="Enter title" defaultValue={state.category} onChange={(e)=>setCategory(e.target.value)}/>
      </Form.Group>

      <Form.Group className="mb-3" controlId="formBasicEmail" id='title'>
        <Form.Label>Title</Form.Label>
        <Form.Control type="text" placeholder="Enter title" defaultValue={state.title} onChange={(e)=>setTitle(e.target.value)}/>
      </Form.Group>

      <Form.Group className="mb-3" controlId="formBasicEmail" id='description'>
        <Form.Label>Desciption</Form.Label>
        <Form.Control type="text" placeholder="Enter description" defaultValue={state.description} onChange={(e)=>setDescription(e.target.value)}/>
      </Form.Group>

      <Form.Group className="mb-3" controlId="formBasicEmail" id='assignedFolder'>
        <Form.Label>Assigned Folder</Form.Label>
        <Form.Control type="text" placeholder="Enter assigned folder" defaultValue={state.assignedFolder} onChange={(e)=>setAssignedFolder(e.target.value)}/>
      </Form.Group>
      <Button variant="primary" type="submit" onClick={raiseIssue}>Create</Button>
    </Form>
    </>
  );
}

export default CreateIssue;