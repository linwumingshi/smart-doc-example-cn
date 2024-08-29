package com.power.doc.websocket;

import com.power.doc.entity.Car;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.server.PathParam;
import jakarta.websocket.server.ServerEndpoint;
import org.springframework.stereotype.Component;

/**
 * WebSocket ServerEndpoint Have UrlPathVariable And Subprotocols
 * Have One decoders and encoders
 *
 * @author linwumingshi
 */
@Component
@ServerEndpoint(value = "/smart-doc/websocket/subprotocols/one/new/{id}",
        subprotocols = "test2024",
        decoders = CarDecoder.class,
        encoders = CarEncoder.class)
public class WebSocketServerEndpointOneEncoderDecoder {

    /**
     * url PathVariable id
     */
    private String id;

    /**
     * session
     */
    private Session session;

    /**
     * OnOpen method
     *
     * @param id      url PathVariable id
     * @param session session
     */
    @OnOpen
    public void webSocketServerEndpointOnOpen(@PathParam(value = "id") String id, Session session) {
        this.id = id;
        this.session = session;
    }


    /**
     * OnMessage method.
     *
     * @param car car.
     */
    @OnMessage
    public void carMessage(Car car) throws Exception {
        System.out.println("Message from client: " + car);
        this.sendMessage(car);
    }


    public void sendMessage(Car car) throws Exception {
        if (this.session.isOpen()) {
            this.session.getBasicRemote().sendObject(car);
        }
    }
}
