package filemanagement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import model.Player;
import model.Score;

public class FileManagement {

	private final String SEPARATOR = File.separator;
	private final String FOLDER_DATA = "data";
	private final String LOGIN_FILE = "login";
	private final String SCORE_FILE = "score";

	private File loginFile;

	public FileManagement() {
		this.route();
		this.loginFile = new File(route() + LOGIN_FILE + ".txt");
	}

	private String route() {
		String route = System.getProperty("user.dir") + SEPARATOR + FOLDER_DATA;
		File folder = new File(route);
		if (!folder.exists()) {
			folder.mkdir();
		}

		return route + SEPARATOR;
	}

	public List<Player> getUserLogin() {
		List<Player> userLogin = new ArrayList<Player>();
		File file = new File(route() + LOGIN_FILE + ".txt");

		if (file.exists()) {
			try {
				BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
				String line = null;
				assert line != null;

				while ((line = bufferedReader.readLine()) != null) {
					String[] data = line.split(" ");
					Player player = new Player(data[0], data[1]);
					userLogin.add(player);
				}

				bufferedReader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("The file doesn't exist");
		}

		for (Player player : userLogin) {
			System.out.println(player.toString());
		}

		return userLogin;
	}

	public List<Score> getGameScore() {
		List<Score> scores = new ArrayList<>();
		File file = new File(route() + SCORE_FILE + ".txt");

		if (file.exists()) {
			try {
				BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
				String line = null;
				assert line != null;

				while ((line = bufferedReader.readLine()) != null) {
					String[] data = line.split(",");
					Score score = new Score(data[0], data[1],
							new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH).parse(data[2]));
					scores.add(score);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("The file doesn't exist");
		}
		return scores;
	}

	public void saveScoreData(List<Score> scores) {
		File scoreFile = new File(route() + SCORE_FILE + ".txt");

		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(scoreFile, true));
			if (scoreFile.exists()) {
				bufferedWriter.write(scores.get(scores.size() - 1).toString());
				bufferedWriter.newLine();
			}
			bufferedWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
