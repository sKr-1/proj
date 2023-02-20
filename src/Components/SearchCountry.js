import '../resourses/autocomplete.js'
import { useState,useEffect } from 'react';
import axios from 'axios';

import React from 'react'
import Select from 'react-select'
import Selector from './Selector.js';


export default function SearchCountry(){
    // const [countries,setCountries]=useState([]);

    // const fetchCountry=()=>{
    //     axios.get("http://localhost:8081/getCountry").then((res)=>{
    //             setCountries(res.data)
    //     });
    // }
    // console.log(countries)

    // useEffect(()=>{
    //     fetchCountry()
    // },[])

    return (
        <div className='App'>
            {/* <Select options={countries} /> */}
            <Selector/>
        </div>
    )
    

    // const [countries,setCountries]=useState([]);
    // const [countryMatch,setCountryMatch]=useState([]);
    

    // const fetchCountry=()=>{
    //     axios.get("http://localhost:8081/getCountry").then((res)=>{
    //             setCountries(res.data)
    //     });
    // }

    // useEffect(()=>{
    //     fetchCountry()
    // },[])
    // countries.map((country)=>{
    //     console.log(country['countryCode']+" "+country['countryName'])
    // })
    
    // const  searchCountries=(text)=>{
    //     if(!text){
    //         setCountryMatch([])
    //     }
    //     else{
    //         let matches=countries.filter((country)=>{
    //             const regex=new RegExp(`${text}`,"gi");
    //             return country['countryName'].match(regex) || country['countryCode'].match(regex);
    //         })
    //         setCountryMatch(matches);
    //     }
    // };
    
    // return(
    //     <>  
    //         <div className='container'>
    //             <h2>Country Details</h2>
    //             <Input 
    //                 style={{width:"40%",marginTop:"10px"}} 
    //                 placeholder="Country Name"
    //                 onChange={(e)=>searchCountries(e.target.value)}
    //             />
    //             {countryMatch && countryMatch.map((country,index)=>(
    //                 <div key={index} style={{marginLeft:"5%",marginTop:"5px"}}>
    //                     <Card  key={index} className="card">
    //                         <Card.Body className='cardBody'>
    //                             <Card.Text>{country['countryName']}</Card.Text>
    //                         </Card.Body>
    //                     </Card>
    //                 </div>
    //             ))}
    //         </div>
    //     </>
    // )
}