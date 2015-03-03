package org.future.projectManagement.utils;

public class WhereBuild {
	public String whereBuild(String[] wheres) {
		String where = "";
		if (wheres.length == 0) {
			return null;
		} else {
			for (int i = 0; i < wheres.length; i++) {
				if (i == (wheres.length - 1)) {
					where += "o." + wheres[i] + " = ? ";
				} else {
					where += "o." + wheres[i] + " = ? and ";
				}
			}
			return where;
		}
	}
}
