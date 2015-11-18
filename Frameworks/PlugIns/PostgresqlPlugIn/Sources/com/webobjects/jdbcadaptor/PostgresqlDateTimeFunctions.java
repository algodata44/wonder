package com.webobjects.jdbcadaptor;


/**
 * Added to allow use of postgresql date/time functions {@link http
 * ://www.postgresql.org/docs/9.0/static/functions-datetime.html}
 * 
 * used in {@link PostgresqlExpression}
 * 
 * @author Benoit Havret
 * 
 */
public enum PostgresqlDateTimeFunctions {

	localtimestamp, current_timestamp, localtime, current_time, current_date,

	now {
		public String toString() {
			return "now()";
		}
	},
	timeofday {
		public String toString() {
			return "timeofday()";
		}
	}

}
