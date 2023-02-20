import { Link, Outlet } from 'react-router-dom';
import '../css/navbar.css';
import data from '../resourses/country.json'


export default function NavBar(){
  
    return (
        <nav className="nav">
            <Link to="/" className="site-title">SIMp</Link>
            <ul>
                <li>
                    <Link to="/selectCountry">Create Issues</Link>
                </li>
                <li>
                    <Link to="/selectCountry">Left Issues</Link>
                </li>
                <li>
                    <Link to="/inProgressIssues">In-Progress Issues</Link>
                </li>
                <li>
                    <Link to="/completedIssues" >Completed Issues</Link>
                </li>
            </ul>
        </nav>
        
    )
}
