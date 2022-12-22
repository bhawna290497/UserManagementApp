package com.app.UserManagementApp.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UnlockAccount {

	private String email;
	private String tempPassword;
	private String newPassword;
	private String confirmPwd;
}
