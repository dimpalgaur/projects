import axios from "axios";
const EMPLOYEE_API_GET_URL ="http://localhost:8081/api/allTeacher"
const EMPLOYEE_API_POST_URL ="http://localhost:8081/api/add"

class EmployeeService {

    getTeacher()
    {
        return axios.get(EMPLOYEE_API_GET_URL);
    }
    createTeacher(teacher)
    {
        return axios.post(EMPLOYEE_API_POST_URL,teacher);
    }
  
}
export default new EmployeeService()