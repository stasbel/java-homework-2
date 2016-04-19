package ru.spbau.mit;

/**
 * Created by belaevstanislav on 18.04.16.
 * SPBAU Java practice.
 */

public class Consts {
    protected static final byte LIST_QUERY_ID = 1;
    protected static final byte UPLOAD_QUERY_ID = 2;
    protected static final byte SOURCES_QUERY_ID = 3;
    protected static final byte UPDATE_QUERY_ID = 4;
    protected static final byte STAT_QUERY_ID = 1;
    protected static final byte GET_QUERY_ID = 2;
    protected static final int SERVER_PORT_NUMBER = 8081;
    protected static final int MAX_FILES = 1073741824;
    protected static final long BLOCK_SIZE = 10000000;
    protected static final int BUFF_SIZE = 4096;
    protected static final int IP_ADDRESS_BYTE_COUNT = 4;
    protected static final long ACTIVE_SEED_TIME_MILLIS = 300000;
    protected static final int MIN_ARGS_NUMBER_CLIENT_MAIN = 3;
    protected static final String DEFAULT_DIRECTORY_STR = "./";
    protected static final String SAVE_SERVER_DATA_FILE_NAME = "ServerData.ser";
    protected static final String SAVE_CLIENT_DATA_FILE_NAME = "ClientData";
    protected static final String SAVE_CLIENT_DATA_FILE_EX = ".ser";
    protected static final String WRONG_TYPE_OF_QUERY_MESSAGE = "Wrong type of query!";
    protected static final String BAD_CONNECTION_MESSAGE = "Something went wrong with the connection!";
    protected static final String BAD_IO_NEW_CONNECTIONS_MESSAGE = "Bad I/O while waiting for a connection!";
    protected static final String TOO_MANY_ARGS_MESSAGE = "To many arguments!";
    protected static final String NOT_ENOUGH_ARGS_MESSAGE = "Not enough arguments!";
    protected static final String INVALID_ARGS_MESSAGE = "Invalid arguments!";
    protected static final String NEW_SERVER_ERROR_MESSAGE = "Fail to create new server!";
    protected static final String NEW_CLIENT_ERROR_MESSAGE = "Fail to create new client!";
    protected static final String STOP_SERVER_ERROR_MESSAGE = "Fail to stop server!";
    protected static final String STOP_CLIENT_ERROR_MESSAGE = "Fail to stop client!";
    protected static final String FAIL_TO_LOAD_FILES_MESSAGE = "Fail to load files!";
    protected static final String FAIL_TO_SAVE_FILES_MESSAGE = "Fail to save files!";
    protected static final String NO_SUCH_FILE_MESSAGE = "No such file!";
    protected static final String NOT_ALL_PARTS_DOWNLOADED_MESSAGE = "Not all parts downloaded!";
    protected static final String NO_SUCH_PART_IN_THIS_FILE = "No such part in this file!";

    protected Consts() {
    }
}
