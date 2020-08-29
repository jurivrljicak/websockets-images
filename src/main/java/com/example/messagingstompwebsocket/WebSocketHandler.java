package com.example.messagingstompwebsocket;

import java.io.IOException;

import org.springframework.web.socket.BinaryMessage;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

public class WebSocketHandler extends AbstractWebSocketHandler {
	
	  @Override
	    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws IOException {
	        String msg = String.valueOf(message.getPayload());
	        // Send back unique message depending on the id received from the client
	        switch(msg){
	            case("1"):
	                System.out.println("Dog button was pressed");
	                session.sendMessage(new TextMessage("Woooof"));
	                break;
	            case("2"):
	                System.out.println("Cat button was pressed");
	                session.sendMessage(new TextMessage("Meooow"));
	                break;
	            case("3"):
	                System.out.println("Pig button was pressed");
	                session.sendMessage(new TextMessage("Bork Bork"));
	                break;
	            case("4"):
	                System.out.println("Fox button was pressed");
	                session.sendMessage(new TextMessage("Fraka-kaka-kaka"));
	                break;
	            case("image"):
	            	
	            	String s = "ZGVmIHdpdGhJbWFnZSA9IGZhbHNlOwpjb250ZXh0ID0gIkExMjc3NjEiOwoKaWYgKHdpdGhJbWFnZSkKICAgaW1hZ2VTY3JvbGw9bmV3IEltYWdlUGFkV2l0aFNjcm9sbCgiIiIgIiIiLCAwLCAwLCA2OTAsIDQ4MCwgMzI0KTsKZWxzZSB7CiAgIGNvbnRyb2wuY2xlYXJDb250ZXh0KGNvbnRleHQpCiAgIGxpbmVhc1RpY2tldEVzY2FwYWRhcyA9IG5ldyBTdHJpbmcoIklBMEtJQTBLSUNBZ0lDQWdJQ0FnSUNBZ0lDQWdJQ0FnUWtKV1FTQWdJQ0FnSUNBZ0lDQWdJQ0FnSUNBZ0lBMEtJQTBLSUNBZ0lDQWdJQ0FnSUNCU1JWUkpVazhnUlU0Z1JVWkZRMVJKVms4TkNpQU5DbE5WUXk0Z0lEb2dNVGsySUNBZ0lDQWdJQ0FnSUNBZ0lDQlRSVU11T2lBd01EQXdOdzBLUmtWRFNFRWdPaUF4TkM4d09DOHlNREl3SUNBZ0lDQWdJRWhQVWtFZ09pQXhNRG8xTXpveE9BMEtWRkpCVGxNdU9pQk1Nell3RFFwQlZFVk9SRWxFVHlCUVQxSTZJRUV4TWpjM05qRWdEUW9nSUNBZ0lDQWdJQ0FnSUNBZ0lDQWdJQ0FnSUNBZ0lDQWdJQ0FnSUNBZ0lDQWdJQ0FnSUNBZ0RRb2dEUXBEUVVwQklFUkZJRUZJVDFKU1R5QkZUaUJFVDB4QlVrVlREUXBFUlU1UFRVbE9RVU5KVDA0Z0lEb2dEUXBaVEV4RlUwTkJJRlpCVTFGVlJWb2dVMFZTUVVaSlRpQkJVRUZTU1VOSlR5QWdJQ0FnSUNBZ0RRcERWVVZPVkVFZ0lEb2dNRE0xSUMwZ05qRXhNRE13THpjTkNrbE5VRTlTVkVVNklGVWtVeUEwTURBc01EQWdJQ0FnSUNBZ0lDQWdJQ0FnSUEwS0lBMEtVa1ZEU1VKSklFTlBUa1pQVWsxRk9nMEtJQTBLUTI5dWIzcGpieUI1SUdGalpYQjBieUJ4ZFdVZ1pXd2dZMjl0Y0hKdlltRnVkR1VnWkdVZ0lBMEtaWE4wWVNCdmNHVnlZV05wYjI0Z2MyVnlZU0J3ZFdWemRHOGdZU0JrYVhOd2IzTnBZMmx2YmcwS1pXNGdRbUZ1WTJFZ1QyNXNhVzVsSUhrZ2IzQmphVzl1WVd4dFpXNTBaU0JsYm5acFlXUnZJQTBLY0c5eUlHMWhhV3dnWVNCc1lTQmpZWE5wYkd4aElHUmxJR052Y25KbGJ5QnhkV1VnSUNBZ0lBMEtkR1Z1WjI4Z2NtVm5hWE4wY21Ga1lTQmxiaUJzWVNCbGJuUnBaR0ZrSUNBZ0lDQWdJQ0FnSUEwS0lBMEtJQTBLSUEwS0lBMEtMaTR1TGk0dUxpNHVMaTR1TGk0dUxpNHVMaTR1TGk0dUxpNHVMaTR1TGk0dUxpNHVMaTR1TGcwS0lDQWdJQ0FnSUNBZ0lDQWdJQ0FnSUNCR1NWSk5RUTBLVTJWeVlXWnBiaUJCY0dGeWFXTnBieUJaYkd4bGMyTmhJRlpoYzNGMVpYb2dJQ0FnSUNBZ0lBMEtSRTlET2lBek1TMHdNREF3TURrME56Z3hPRFl3RFFvZ0RRb2dEUW9nRFFvZ0RRb2dEUW89Ii5kZWNvZGVCYXNlNjQoKSkKICAgaW1hZ2VTY3JvbGw9bmV3IEltYWdlUGFkV2l0aFNjcm9sbCgwLCAwLCA2OTAsIDQ4MCwgbGluZWFzVGlja2V0RXNjYXBhZGFzICwgMzI0LCAyNSwgIkNvdXJpZXIiLCA0NSk7Cn0Kc2NyZWVucyA9IFsKICAgbmV3IFNjcmVlblBhZCgKICAgICAgIlNjcmVlbl8xIiwKICAgICAgW25ldyBJbWFnZVBhZCgicmVzb3VyY2U6Ly9pbWFnZXMvZm9uZG9fYXp1bF84MDAucG5nIiwgMCwgMCwgODAwLCA0ODApLCBpbWFnZVNjcm9sbF0sCiAgICAgIFsKICAgICAgICAgbmV3IEJ1dHRvblBhZCg2OTUsICA4NSwgMTAwLCAgNzUsIHstPnNjcm9sbFVwICAoKX0sICJyZXNvdXJjZTovL2ltYWdlcy9ib3Rfc2Nyb2xsX3VwXzEwMHB4LnBuZyIpLAogICAgICAgICBuZXcgQnV0dG9uUGFkKDY5NSwgMTY1LCAxMDAsICA3NSwgey0+c2Nyb2xsRG93bigpfSwgInJlc291cmNlOi8vaW1hZ2VzL2JvdF9zY3JvbGxfZG93bl8xMDBweC5wbmciKSwKICAgICAgICAgbmV3IEJ1dHRvblBhZCg2OTUsIDI1MCwgMTAwLCAgNTAsIHstPnJlc2V0ICAgICAoKX0sICJyZXNvdXJjZTovL2ltYWdlcy9ib3RfYm9ycmFyXzEwMHB4LnBuZyIpLAogICAgICAgICBuZXcgQnV0dG9uUGFkKDY5NSwgMzA1LCAxMDAsICA1MCwgey0+Y2FuY2VsICAgICgpfSwgInJlc291cmNlOi8vaW1hZ2VzL2JvdF9jYW5jZWxhcl8xMDBweC5wbmciKSwKICAgICAgICAgbmV3IEJ1dHRvblBhZCg2OTUsIDM3NSwgMTAwLCAxMDAsIHstPmFjY2VwdCAgICAoKX0sICJyZXNvdXJjZTovL2ltYWdlcy9ib3RfYWNlcHRhcl8xMDBweC5wbmciKQogICAgICBdLAogICAgICBuZXcgU2lnbmF0dXJlQXJlYShpbWFnZVNjcm9sbCkKICAgKQpdCgpjbGllbnRJRCA9ICJOcm9jbGllbnRlPTE5ODczMTQ3fE51bWVyb2RvYz0wMDAwMDk0NzgxODYwIgoKZGVmIGdvU2NyKGludCBwYWdlKXsKICAgY29udHJvbC5nb1NjcihwYWdlKQp9CgpkZWYgYWNjZXB0KCl7CiAgIGlmIChjb250cm9sLmhhc1NpZ24oKSl7CiAgICAgIGNvbnRyb2wKICAgICAgICAgLmxvYWRTaWduU2luZ2xlSW1hZ2UoMjAwMCwgMTEyNSwgMTEpCiAgICAgICAgIC5nZXREYXRhRm9ybVNpZ24oKQogICAgICAgICAubG9hZFNpZ25Db21wbGV0SW1hZ2UoKQogICAgICAgICAucHVibGlzaEltYWdlKDMsIGNvbnRleHQsICJUaWNrZXRJbWdfMCIpCiAgICAgICAgIC5lbmQoKQogICB9ZWxzZXsKICAgICAgY29udHJvbC5jYW5jZWwoKQogICB9Cn0KCmRlZiBjYW5jZWwoKXsKICAgY29udHJvbC5jYW5jZWwoKQp9CgpkZWYgcmVzZXQoKXsKICAgY29udHJvbC5yZXNldCgpCn0KCmRlZiBpbml0KCl7CiAgIHByaW50bG4gIklEIENsaWVudDogIiArIGNsaWVudElECiAgIGltYWdlU2Nyb2xsLnNjcm9sbERvd24oKQp9CgpkZWYgc2Nyb2xsVXAoKXsKICAgaW1hZ2VTY3JvbGwuc2Nyb2xsVXAoKQp9CgpkZWYgc2Nyb2xsRG93bigpewogICBpbWFnZVNjcm9sbC5zY3JvbGxEb3duKCkKfQo=";
	                System.out.println("return an image");
	                session.sendMessage(new BinaryMessage(s.getBytes()));
	                break;
	            default:
	                System.out.println("Connected to Client");
	        }
	    }


}
