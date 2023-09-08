import React, { useEffect, useState } from 'react';
import axios from 'axios';
import './App.css'

function App() {
  const [todos, setTodos] = useState([]);

  useEffect(() => {
    axios.get('http://localhost:4444/users/1/todos')
      .then(response => {
        setTodos(response.data);
      })
      .catch(error => {
        console.error('API çağrısında bir hata oluştu!', error);
      });
  }, []);


  return (
    <>
      <div className="container bg-secondary-subtle rounded">
        <div className="row">
          <h1>Todo List</h1>
          <div className="col-12 mb-5">
            <form>
              <div className="mt-5 d-flex align-items-center">
                <span className="col-1">
                  <svg xmlns="http://www.w3.org/2000/svg" width="36" height="36" fill="currentColor" class="bi bi-file-earmark-plus" viewBox="0 0 16 16">
                    <path d="M8 6.5a.5.5 0 0 1 .5.5v1.5H10a.5.5 0 0 1 0 1H8.5V11a.5.5 0 0 1-1 0V9.5H6a.5.5 0 0 1 0-1h1.5V7a.5.5 0 0 1 .5-.5z" />
                    <path d="M14 4.5V14a2 2 0 0 1-2 2H4a2 2 0 0 1-2-2V2a2 2 0 0 1 2-2h5.5L14 4.5zm-3 0A1.5 1.5 0 0 1 9.5 3V1H4a1 1 0 0 0-1 1v12a1 1 0 0 0 1 1h8a1 1 0 0 0 1-1V4.5h-2z" />
                  </svg>
                </span>
                <input type="task" class="form-control" id="inputTask" />
                <button type="submit" class="btn btn-primary m-2">Ekle</button>
              </div>
            </form>
          </div>
        </div>
        <div className="row mb-5">
          <div className="col-12 mb-5">
            <button type="button" class="btn btn-primary m-1 col-3">Tümü</button>
            <button type="button" class="btn btn-primary m-1 col-3">Bitenler</button>
            <button type="button" class="btn btn-primary m-1 col-3">Bitmeyenler</button>
          </div>
        </div>
        <div className="row mt-5">
          <div className="col-12 mb-5">
            <ul className="list-group">

              {todos.map(todo => (
                <li className="list-group-item">
                  <div className="d-flex align-items-center">
                    <div>{todo.title}</div>
                    <span className="ms-auto">
                      <input type="checkbox" className="form-check-input p-2 m-3 " id="checkbox1" />
                      <button type="button" className="btn btn-sm btn-warning m-2">Düzenle</button>
                      <button type="button" className="btn btn-sm btn-danger m-2">Sil</button>
                    </span>
                  </div>
                </li>

              ))}

            </ul>
          </div>
        </div>
        <div className="row mt-5">
          <div className="col-12 mt-5">
            <button type="button" class="btn btn-danger m-1 col-5">Tümü</button>
            <button type="button" class="btn btn-danger m-1 col-5">Bitenler</button>
          </div>
        </div>
      </div >
    </>
  )
}

export default App
