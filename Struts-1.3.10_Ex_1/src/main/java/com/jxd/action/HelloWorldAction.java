package com.jxd.action;

import com.jxd.form.HelloWorldForm;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		if (form != null) {
			HelloWorldForm helloWorldForm = (HelloWorldForm) form;
			helloWorldForm.setHello("Using Struts 1.3.10");
		}
		return mapping.findForward("logical_name"); // Logical name having no clue about UI.

	}
}

/*
Action : Perform some operation, such as including other pages to the current page. 
*/