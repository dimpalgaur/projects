import React, { Component } from 'react';
import EmployeeService from '../services/EmployeeService';

class CreateEmployee extends Component {
    constructor(props){
        super(props)
        this.state={
            id:'',
            teacherName:'',
            className:'',
            dayOfWeek:'',
            startTime:'',
            endTime:'',
            isAvailable:''
        }
        this.changeIdHandler = this.changeIdHandler.bind(this);
        this.changeTeacherNameHandler = this.changeTeacherNameHandler.bind(this);
        this.saveTeacher = this.saveTeacher.bind(this);
        
    }
    saveTeacher = (t) => {
        t.preventDefault();
        let teacher = {id: this.state.id, teacherName: this.state.teacherName,className: this.state.className,dayOfWeek: this.state.dayOfWeek,startTime: this.state.startTime,endTime: this.state.endTime,isAvailable: this.state.isAvailable};
        console.log('teacher =>' + JSON.stringify(teacher));

        EmployeeService.createTeacher(teacher).then(res => 
            {
                this.props.history.push('/teachers');
            });
    }
    cancel(){
        this.props.history.push('/teachers');
    }
    changeIdHandler=(event)=>{
       this.setState({id: event.target.value});
    }
    changeTeacherNameHandler=(event)=>{
        this.setState({teacherName: event.target.value});
     }
     changeClassHandler=(event)=>{
        this.setState({className: event.target.value});
     }
     changedayOfWeekHandler=(event)=>{
        this.setState({dayOfWeek: event.target.value});
     }
     changeStartTimeHandler=(event)=>{
        this.setState({startTime: event.target.value});
     }
     changeEndTimeHandler=(event)=>{
        this.setState({endTime: event.target.value});
     }
     changeAvailabilityHandler=(event)=>{
        this.setState({isAvailable: event.target.value});
     }
    
    render() {
        return (
            <div>
                <div className="container">
                    <div className ="row">
                        <div className="card col-md-6 offser-md-3 offset-md-3">
                            <h3 className="text-center">Add Teacher</h3>
                            <div className="card-body">
                              <form>
                                <div className="form-group">
                                    <label>Teacher Id</label>
                                    <input placeholder="Teacher Id" name="id" className="form-control"
                                    value={this.state.id} onChange={this.changeIdHandler}/>
                                </div>
                                <div className="form-group">
                                    <label>Teacher Name</label>
                                    <input placeholder="Teacher Name" name="teacherName" className="form-control"
                                    value={this.state.teacherName} onChange={this.changeTeacherNameHandler}/>
                                </div>
                                <div className="form-group">
                                    <label>Class Name</label>
                                    <input placeholder="Class Name" name="className" className="form-control"
                                    value={this.state.className} onChange={this.changeClassHandler}/>
                                </div>
                                <div className="form-group">
                                    <label>dayOfWeek</label>
                                    <input placeholder="dayOfWeek" name="dayOfWeek" className="form-control"
                                    value={this.state.dayOfWeek} onChange={this.changedayOfWeekHandler}/>
                                </div>
                                <div className="form-group">
                                    <label>Start Time</label>
                                    <input placeholder="Start Time" name="startTime" className="form-control"
                                    value={this.state.startTime} onChange={this.changeStartTimeHandler}/>
                                </div>
                                <div className="form-group">
                                    <label>End Time</label>
                                    <input placeholder="End Time" name="endTime" className="form-control"
                                    value={this.state.endTime} onChange={this.changeEndTimeHandler}/>
                                </div>
                                <div className="form-group">
                                    <label>Availability</label>
                                    <input placeholder="Availability" name="isAvailable" className="form-control"
                                    value={this.state.isAvailable} onChange={this.changeAvailabilityHandler}/>
                                </div>
                                <button className="btn btn-success" onClick={this.saveTeacher}>Submit</button>
                                <button className="btn btn-danger" onClick={this.cancel.bind(this)} style={{marginLeft: "10px"}}>Cancel</button>
                                </form>  
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        );
    }
}

export default CreateEmployee;