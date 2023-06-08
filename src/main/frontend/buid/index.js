function addEmployee() {
    
  let name = document.getElementById("name").value;
  let lastName = document.getElementById("lastName").value;
  let department = document.getElementById("department").value;
  let phone = document.getElementById("phone").value;
  let email = document.getElementById("email").value;
  
  // create a new employee
  let newEmployee = {
    name: name,
    lastName: lastName,
    department: department,
    phone: phone,
    email: email
  };
  
  // post async
  fetch('http://localhost:8080/api/v1/employee/employees1', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(newEmployee)
  })
  .then(function(response) {
    if (response.ok) {
      // success
      alert('Employee added');
      // update the list
      getAllEmployees();
    } else {
      // error
      alert('Error to add the employee');
    }
  })
  .catch(function(error) {
    // Error
    alert('Error: ' + error.message);
  });
}

  