package common;

public class ServerInfo {

	private String address;
	private int port;

	public ServerInfo (String address, int port ){
		this.address = address;
		this.port = port;
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
