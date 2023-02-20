import React, { useState, useMemo } from 'react'
import { Link } from 'react-router-dom'
import Select from 'react-select'
import countryList from 'react-select-country-list'
import '../css/selector.css'

function Selector({setCountry}) {
  const [value, setValue] = useState('')
  const [selected, setSelected] = useState(false)
  const options = useMemo(() => countryList().getData(), [])

  const changeHandler = value => {
    setValue(value);
    setCountry(value['label'])
    setSelected(true)
  }

  return(
    <>
        <div className='container'>
            <div className='selector'>
                <p>Select Country</p>
                <Select options={options} value={value} defaultValue={value} onChange={changeHandler}/>
                
                {selected?(<Link to={'/showTemplates'} className='LinkActive' state={value}>Move</Link>):(<Link to="/" onClick={event => event.preventDefault()} className='LinkDisabled'>Move</Link>)}
                
                
            </div>
        </div>
    </>
  )
}

export default Selector