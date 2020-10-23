package com.web.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.controller.ReimbursementDataController;
import com.web.controller.UserController;

public class RequestForwarder {

	public String routes(HttpServletRequest req) {
		switch (req.getRequestURI()) {
		case "/Project1/login.page":
			return new UserController().login(req);

		default:
			return "html/index.html";
		}
	}

	public void data(HttpServletRequest req, HttpServletResponse res) throws IOException {
		switch (req.getRequestURI()) {

		case "/Project1/all.json":
			new ReimbursementDataController().sendAllData(res);
			break;

		case "/Project1/complete.json":
			new ReimbursementDataController().sendCompleteReimbursements(res);
			break;

//		case "/HallowsMonsters/monster.json":
//			new SaveController().save(req, res);
//			break;
//		}
		}
	}
}
