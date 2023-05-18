import React, { Component } from 'react';
import EmployeeService from '../services/EmployeeService';
import { Link } from 'react-router-dom';
//import{Button} from 'reactstrap'; 


class ListEmployeeComponents extends Component {
    constructor(props){
        super(props)
        this.state={
            teachersArray: []
        }
        this.addTeacher = this.addTeacher.bind(this);
        // we have bind event handler method addEmployeewith the help of constructor
    }
    componentDidMount(){
        EmployeeService.getTeacher().then((res)=>{
            this.setState({teachersArray: res.data})
        });
    }
    addTeacher(){
        this.props.history.push('/add-teacher');
       }
    render() {
        return (
            <div>
                <h2 className="text-center">Scrum Teachnology Employees</h2>
                <Link to="/add-teacher">
                        <button className='btn btn-primary'>Add Employee</button>
                    </Link>
                    {/* <button className="btn btn-primary" onClick={this.addEmployee}>Add Employee</button> */}
                 {/* addEmployee is event handler method which needs to bind via constructor */}
                <div className="row">
                    <table className="table table-striped table-bordered">
{/* </table>To use "className" feature of bootstrap we need to add one link in (public->index.html->below the "<title>React App</title>")
and the link we can find at (search introduction bootstrap -> "go to CSS Copy-paste the stylesheet <link> into your <head> before all other stylesheets to load our CSS." and copy the below link and paste it on index.html file)
and the link is -> <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
     */}
                      <thead>
                        <tr>
                        <th>Id</th>
                            <th>Teacher name</th>
                            <th>Class Name</th>
                            <th>Days of Week</th>
                            <th>Start Time</th>
                            <th>End Time</th>
                            <th>Availability</th>
                            <th>Actions</th>
                        </tr>
                     </thead>
                     <tbody>
                        {
                            this.state.teachersArray.map(
                                teacher => 
                                <tr key={teacher.id}>
                                    <td> {teacher.id} </td>
                                <td> {teacher.teacherName} </td>
                                    <td> {teacher.className} </td>
                                    <td> {teacher.dayOfWeek} </td>
                                    <td> {teacher.startTime} </td>
                                    <td> {teacher.endTime} </td>
                                    <td> {String(teacher.isAvailable)} </td> 
                         {/* reactjs can not show boolean value directly on the web 
                         page we nnet to typecast it via convert it into String */}
                                </tr>
                                
                            )
                        }
                     </tbody>
                     </table> 
                     </div>
            </div> 
        );
    }
}

export default ListEmployeeComponents;