
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.NoSuchAlgorithmException;

import com.turn.ttorrent.client.Client;
import com.turn.ttorrent.client.SharedTorrent;

public class TTorrentDownloader{
    public static void main(String[] args) throws UnknownHostException, NoSuchAlgorithmException, IOException {
    try {
			Client client = new Client(InetAddress.getLocalHost(),
					SharedTorrent.fromFile(new File("C://Ubuntu_16.04.01.torrent"), new File("C://Temp/Torrent")));
          
       //SharedTorrent.fromFile(directory to torrent file, directory to download));
       
			client.download();
			client.waitForCompletion();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    }
}
