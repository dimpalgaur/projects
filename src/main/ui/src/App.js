import './App.css';
import ListEmployeeComponents from './components/ListEmployeeComponents';
import HeaderComponent from './components/HeaderComponent';
import FooterComponent from './components/FooterComponent';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom'
import CreateEmployee from './components/CreateEmployee';

function App() {
  return (
    <div>
      <Router>
      <HeaderComponent />
      <div className="container"> 
      {/* container is a bootstrap css class */}
       <Switch>
        {/* this below path means http://localhost:3000/employees */}
        <Route path="/teachers" component={ListEmployeeComponents}></Route>
        <Route path="/add-teacher" component={CreateEmployee}></Route>
       <ListEmployeeComponents />
       </Switch>
      </div>
      <FooterComponent />
      </Router>
    </div>
  );
}

export default App;
