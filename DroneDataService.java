package com.dronerecon.ws;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.security.SecureRandom;
/**
 *
 * @author Julian Stinnett
 */
public class DroneDataService extends HttpServlet{
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=utf-8");
        response.addHeader("Access-Control-Allow-Origin", "*");
        PrintWriter out = response.getWriter();


        String sArea_id = request.getParameter("area_ids");
        String sTileX = request.getParameter("tilex");
        String sTileY = request.getParameter("tiley");
        String sTotalCols = request.getParameter("totalcols");
        String sTotalRows = request.getParameter("totalrows");

        String sDirection = "right";

        // ##############################
        // ##############################
        // 3. Calculate next drone move.
        // Determine next tile to move to.
        // Base this on current x and y.
        // Change sDirection if necessary.
        // Drone must serpentine from top left of grid back and forth down.
        // If rows are done, change sDirection to "stop".
        int iTileX = Integer.parseInt(sTileX);
        int iTileY = Integer.parseInt(sTileY);
        int iTotalCols = Integer.parseInt(sTotalCols);
        int iTotalRows = Integer.parseInt(sTotalRows);

        if(iTileX == (iTotalCols - 1)  && iTileY ==(iTotalRows - 1)){
            sDirection = "stop";
        else if()
        }

        // ##############################
        // ##############################
        // 4. Format & Return JSON string to caller.
        /* Return via out.println() a JSON string like this:
        {"area_id":"[area id from above]", "nextTileX":"[next tile x]",
"nextTileY":"[next tile y]", "direction":"[direction string from above]"}
        */
        // ##############################
        String sReturnJSON = "{\"area_id\":\"" + sArea_id + "\",\"nextTileX\":\"" + iTileX + "\",\"nextTileY\":\"" + iTileY + "\",\"direction\":\"" + sDirection + "\"}";
        out.println(sReturnJSON);
    }
}
