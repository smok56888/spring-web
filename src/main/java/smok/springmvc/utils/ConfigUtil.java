package smok.springmvc.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;

public class ConfigUtil {

	private static Properties properties = null;
	private static final String file_classpath = "classpath:configs/config.properties";
	private static final String file_path = "configs/config.properties";
	static {
		initProperties();
	}

	public static void main(String[] args) {
		System.out.println(getString("test2"));
	}

	private static void initProperties() {

		InputStream in = null;
		try {
			// in = new FileInputStream(ResourceUtils.getFile(file_classpath));
			in = new ClassPathResource(file_path).getInputStream();
			BufferedReader bf = new BufferedReader(new InputStreamReader(in, Constants.CharSet.UTF8));
			properties = new Properties();
			properties.load(bf);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static String getString(String key) {
		return get(key);
	}

	public static int getInt(String key, int defaultVal) {
		try {
			String value = get(key);
			if (value != null && !value.isEmpty()) {
				return Integer.parseInt(value);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return defaultVal;

	}

	public static boolean getBoolean(String key) {
		String value = properties.getProperty(key);
		if (value != null && !value.isEmpty() && value.equals("true")) {
			return true;
		} else {
			return false;
		}
	}

	private static String get(String key) {
		return properties.getProperty(key);
	}
}