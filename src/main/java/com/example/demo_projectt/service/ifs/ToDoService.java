package com.example.demo_projectt.service.ifs;

import java.util.List;

import com.example.demo_projectt.entity.ToDo;
import com.example.demo_projectt.vo.ToDoReq;

public interface ToDoService {

	public List<ToDo> getToDoList() throws Exception;

	public List<ToDo> getToDoList(ToDoReq req) throws Exception;

	public void createToDo(ToDoReq req) throws Exception;

	public void setIsCheckedOfToDo(ToDoReq req) throws Exception;

	public void updateToDo(ToDoReq req) throws Exception;

	public void deleteToDo(ToDoReq req) throws Exception;

}
