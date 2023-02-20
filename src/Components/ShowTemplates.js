import axios from "axios";
import { useEffect, useState,createContext } from "react";
import { useLocation } from "react-router-dom";

import Cards from "../Components/Cards"
import SearchBar from "./SearchBar";




export default function ShowTemplates(){
    const location = useLocation();
    const state = location.state;
    //country info comes in {value:'IN', label:'India'} format to get country name use state.label

    const [templates,setTemplates]=useState([])
    const fetchTemplates=()=>{
        axios.get(`http://localhost:8081/showTemplate/${state.label}`).then((res)=>{
            setTemplates(res.data)
        });
    }

    useEffect(()=>{
        fetchTemplates()
    },[])
    
    
    return (
        
        
        <>
                <h1>Showing OnBoardings for {state.label}</h1>
                {/* <SearchBar/> */}
                {
                    templates.map((Cards))
                }
            
        </>
        
    )
}