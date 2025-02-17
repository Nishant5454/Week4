package JUnit.testing.calculator.DatabaseConnection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {
    private databaseConnection db;

    @BeforeEach
    void setUp() {
        db = new databaseConnection();
        db.connect();
    }

    @AfterEach
    void tearDown() {
        db.disconnect();  // Ensure the database is disconnected after each test
    }

    @Test
    void testIsConnected() {
        assertTrue(db.isConnected(), "Database should be connected");
    }

    @Test
    void testIsDisconnected() {
        db.disconnect();
        assertFalse(db.isConnected(), "Database should be disconnected");
    }
}
