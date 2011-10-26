package cn.com.jit.ida.ca.displayrelated.initserver;

import cn.com.jit.ida.globalconfig.ConfigException;
import cn.com.jit.ida.globalconfig.ParseXML;
import cn.com.jit.ida.log.LogManager;
import cn.com.jit.ida.log.SysLogger;

public class InitLog extends InitFather {

	public InitLog(ParseXML init) throws Exception {
		super(init);
	}

	public InitLog() throws Exception {
		super();
	}

	public void initialize() throws ConfigException {

	}

	public SysLogger initLog() {
		LogManager localLogManager = new LogManager();
		LogManager.init();
		SysLogger logger = LogManager.getSysLogger();
		return logger;
	}
}
