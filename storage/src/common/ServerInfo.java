package common;


public class ServerInfo {

	private String address;
	private int port;
	private String serverName;
	private boolean isServerLaunched;

	public ServerInfo (String address, int port ){
		this.address = address;
		this.port = port;
	}
	
	
	public ServerInfo(String address, int port, boolean isServerLaunched) {
	    this(address, port);
	    this.isServerLaunched = isServerLaunched;
	}
	public ServerInfo(String serverInfoString) {
	    fromString(serverInfoString);
	}


	private void fromString(String serverInfoString) {
	 // should be something like nodeName host port 
	    if (serverInfoString!=null && !serverInfoString.isEmpty()){
		String[] tokens = serverInfoString.split(" ");
		if (tokens.length==3){
		    setServerName(tokens[0]);
		    setAddress(tokens[1]);
		    setPort(Integer.parseInt(tokens[2]));
		}else 
		    throw new IllegalArgumentException("Config file is not formatted as expected. near "+serverInfoString);
		
	    }
	    
	}


	public ServerInfo (){
		
	}
	
	

	public String getAddress () {
		return address;
	}

	public void setAddress ( String address ) {
		this.address = address;
	}

	public int getPort () {
		return port;
	}

	public void setPort ( int port ) {
		this.port = port;
	}


	public boolean isServerLaunched() {
	    return isServerLaunched;
	}


	public void setServerLaunched(boolean isServerLaunched) {
	    this.isServerLaunched = isServerLaunched;
	}

	

	public String getServerName() {
	    return serverName;
	}


	public void setServerName(String serverName) {
	    this.serverName = serverName;
	}


	@Override
	public int hashCode () {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ( ( address == null ) ? 0 : address.hashCode () );
		result = prime * result + port;
		return result;
	}

	@Override
	public boolean equals ( Object obj ) {
		if ( this == obj )
			return true;
		if ( obj == null )
			return false;
		if ( getClass () != obj.getClass () )
			return false;
		ServerInfo other = ( ServerInfo ) obj;
		if ( address == null ) {
			if ( other.address != null )
				return false;
		} else if ( ! address.equals ( other.address ) )
			return false;
		if ( port != other.port )
			return false;
		return true;
	}

}
