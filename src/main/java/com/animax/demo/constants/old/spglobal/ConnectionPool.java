package com.animax.demo.constants.old.spglobal;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ConnectionPool {
    private BlockingQueue<Connection> pool;
    private static final int MAX_CONNECTIONS = 5;

    public ConnectionPool() {
        pool = new ArrayBlockingQueue<>(MAX_CONNECTIONS);
        for (int i = 0; i < MAX_CONNECTIONS; i++) {
            pool.offer(new Connection()); // Assume Connection is a class representing a connection
        }
    }

    public synchronized Connection acquire() throws InterruptedException {
        while (pool.isEmpty()) {
            wait(); // Wait until a connection becomes available
        }
        Connection connection = pool.take();
        notifyAll(); // Notify waiting threads that a connection has been acquired
        return connection;
    }

    public synchronized void release(Connection connection) throws InterruptedException {
        while (pool.size() >= MAX_CONNECTIONS) {
            wait(); // Wait until there is space in the pool
        }
        pool.offer(connection); // Release the connection back to the pool
        notifyAll(); // Notify waiting threads that a connection has been released
    }

    // Inner class representing a connection
    private class Connection {
        // Assume connection properties and methods
    }
}
