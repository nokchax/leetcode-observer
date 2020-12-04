package com.nokchax.observer.leetcode.core;

// dispatch message
public class MessageDispatcher {

    // get message and return response message
    // error catch
    // make response message

    /*
    @PostConstruct
    private void init() {
        // init command and mapping command to command controller
    }
     */

    /*
    protected void service(final RequestMessage request, final ResponseMessage response) {
        try {
            // get handler and handling message
            Object handler = findHandler(request);

            handle(handler, request, response);
        } catch (ApiException e) {
            logger.error("{}", e.getMessage());
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
        } catch (Exception e) {
            logger.error("{}", e.getMessage());
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        } catch (Throwable e) {
            logger.error("Exception : {}", e);
            throw new ServletException(e.getMessage());
        }
    }
     */

}
