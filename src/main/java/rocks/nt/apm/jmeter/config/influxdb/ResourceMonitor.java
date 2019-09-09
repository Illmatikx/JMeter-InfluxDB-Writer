package rocks.nt.apm.jmeter.config.influxdb;

/**
 * Constants (Tag, Field, Measurement) names for the requests measurement.
 * 
 * @author Alexander Wert
 *
 */
public interface ResourceMonitor {

	/**
	 * Measurement name.
	 */
	String MEASUREMENT_NAME = "resources";

	/**
	 * Tags.
	 */
	public interface Tags {
		/**
		 * Request name tag.
		 */
		String NODE_NAME = "nodeName";

	}

	/**
	 * Fields.
	 */
	public interface Fields {

		String SYSTEM_CPU_LOAD = "systemCpuLoad";
		/*Returns the "recent cpu usage" for the whole system. This value is a double in the [0.0,1.0] interval.
		A value of 0.0 means that all CPUs were idle during the recent period of time observed, while a value of 1.0 means that all CPUs were actively running 100% of the time during the recent period being observed.
		All values betweens 0.0 and 1.0 are possible depending of the activities going on in the system. If the system recent cpu usage is not available, the method returns a negative value.*/
		String PROCESS_CPU_LOAD = "processCpuLoad";
		//Returns the "recent cpu usage" for the Java Virtual Machine process.
		String PROCESS_CPU_TIME = "processCpuTime";
		//Returns the CPU time used by the process on which the Java virtual machine is running in nanoseconds.
		String COMMITED_MEMORY = "memoryCommited";
		//Returns the amount of virtual memory that is guaranteed to be available to the running process in bytes, or -1 if this operation is not supported.

		}
}
