package net.jodah.lyra.event;

import com.rabbitmq.client.Connection;

/**
 * Listens for {@link Connection} related events.
 * 
 * @author Jonathan Halterman
 */
public interface ConnectionListener {
  /**
   * Called after the {@code connection} is successfully created.
   */
  void onCreate(Connection connection);

  /**
   * Called after connection creation fails.
   */
  void onCreateFailure(Throwable failure);

  /**
   * Called after the {@code connection}, along with its channels, is recovered from an unexpected
   * closure.
   */
  void onRecovery(Connection connection);

  /**
   * Called after the {@code connection} fails to recover from an unexpected closure.
   */
  void onRecoveryFailure(Connection connection, Throwable failure);
}
