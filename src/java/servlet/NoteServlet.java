package servlet;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Note;

public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //FileReader
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        
        //String text = br.readLine();
            
        //while (text != null){
            //GetParameters
            String tInput = br.readLine();
            String cInput = br.readLine();
            
            Note nData = new Note(tInput, cInput);
            request.setAttribute("nData", nData);
        //}
        
        //Note nData = new Note(tInput, cInput);
        //request.setAttribute("nData", nData);
        
        String edit = request.getParameter("edit");
        if(edit == null){
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request, response); 
        }
        else{
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp")
                .forward(request, response); 
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
        
        String tInput = request.getParameter("title");
        String cInput = request.getParameter("content");
        Note nData = new Note(tInput, cInput);
        
        //GetParameters
        pw.println(nData.getTitle());
        pw.println(nData.getContent());
                
        request.setAttribute("nData", nData);
                
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
