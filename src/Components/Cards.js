import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';
import { Link } from 'react-router-dom';
import { Label } from 'reactstrap';
import '../css/card.css'


function Cards(props,index) {
  return (
    
    <Card  key={index} className="card">
      <Card.Body className='cardBody'>
        <div className='left'>
          <Card.Title>{props.issueName}</Card.Title>
          <Card.Text>{props.category}</Card.Text>
        </div>
        <div className='right'>
        <Card.Text>{props.title}</Card.Text>
        <Card.Text>{props.description}</Card.Text>
        <Card.Text>{props.assignedFolder}</Card.Text>
        </div>
        <Link className='btn' to='/createIssues' state={props}>Select</Link>
        
        {console.log(props)}
      </Card.Body>
    </Card>
  );
}

export default Cards;