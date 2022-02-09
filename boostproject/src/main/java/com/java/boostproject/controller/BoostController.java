package com.java.boostproject.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.java.boostproject.model.BoardVO;
import com.java.boostproject.model.Criteria;
import com.java.boostproject.model.MemVO;
import com.java.boostproject.model.PageVO;
import com.java.boostproject.service.IBoardService;
import com.java.boostproject.service.IMemService;



/**
 * Handles requests for the application home page.
 */
@Controller
public class BoostController {
   
   @Autowired
   IMemService memService;
   
   @Autowired
   IBoardService boardService;
   
   
   @RequestMapping(value = "/soge", method = RequestMethod.GET)
   public String soge() {
      return "soge";
   }
   
   @RequestMapping(value = "/soge#연구단계", method = RequestMethod.GET)
   public String soge1() {
      return "soge#연구단계";
   }
   
   @RequestMapping(value = "/soge#데이터%20및%20분석방법", method = RequestMethod.GET)
   public String soge2() {
      return "soge#데이터%20및%20분석방법";
   }
   
   @RequestMapping(value = "/H", method = RequestMethod.GET)
   public String H(HttpServletRequest req, HttpServletResponse res) throws IOException {
	   String urlResult;
	   HttpSession session = req.getSession();
	   String mem = (String)session.getAttribute("member");
	   String admin = (String)session.getAttribute("admin");
	   if(mem != null || admin != null) {
		   urlResult = "H";
	   }else {
		   urlResult = "sign_in";
		   res.setContentType("text/html; charset=euc-kr");
		   PrintWriter out = res.getWriter();
		   out.println("<script>alert('로그인 후 이용가능한 서비스입니다'); </script>");
		   out.flush();
	   }
      return urlResult;
   }
   
   @RequestMapping(value = "/M", method = RequestMethod.GET)
   public String M(HttpServletRequest req, HttpServletResponse res) throws IOException {
	   String urlResult;
	   HttpSession session = req.getSession();
	   String mem = (String)session.getAttribute("member");
	   String admin = (String)session.getAttribute("admin");
	   if(mem != null || admin != null) {
		   urlResult = "M";
	   }else {
		   urlResult = "sign_in";
		   res.setContentType("text/html; charset=euc-kr");
		   PrintWriter out = res.getWriter();
		   out.println("<script>alert('로그인 후 이용가능한 서비스입니다'); </script>");
		   out.flush();
	   }
      return urlResult;
   }
   
   @RequestMapping(value = "/L", method = RequestMethod.GET)
   public String L(HttpServletRequest req, HttpServletResponse res) throws IOException {
	   String urlResult;
	   HttpSession session = req.getSession();
	   String mem = (String)session.getAttribute("member");
	   String admin = (String)session.getAttribute("admin");
	   if(mem != null || admin != null) {
		   urlResult = "L";
	   }else {
		   urlResult = "sign_in";
		   res.setContentType("text/html; charset=euc-kr");
		   PrintWriter out = res.getWriter();
		   out.println("<script>alert('로그인 후 이용가능한 서비스입니다'); </script>");
		   out.flush();
	   }
      return urlResult;
   }   
   @RequestMapping(value = "/meta", method = RequestMethod.GET)
   public String meta() {

      return "meta";
   }
   
   @RequestMapping(value = "/Hcircle", method = RequestMethod.GET)
   public String Hcircle(HttpServletRequest req, HttpServletResponse res) throws IOException {
	   String urlResult;
	   HttpSession session = req.getSession();
	   String mem = (String)session.getAttribute("member");
	   String admin = (String)session.getAttribute("admin");
	   if(mem != null || admin != null) {
		   urlResult = "H";
	   }else {
		   urlResult = "sign_in";
		   res.setContentType("text/html; charset=euc-kr");
		   PrintWriter out = res.getWriter();
		   out.println("<script>alert('로그인 후 이용가능한 서비스입니다'); </script>");
		   out.flush();
	   }
      return urlResult;
   }
   
   @RequestMapping(value = "/Mcircle", method = RequestMethod.GET)
   public String Mcircle(HttpServletRequest req, HttpServletResponse res) throws IOException {
	   String urlResult;
	   HttpSession session = req.getSession();
	   String mem = (String)session.getAttribute("member");
	   String admin = (String)session.getAttribute("admin");
	   if(mem != null || admin != null) {
		   urlResult = "M";
	   }else {
		   urlResult = "sign_in";
		   res.setContentType("text/html; charset=euc-kr");
		   PrintWriter out = res.getWriter();
		   out.println("<script>alert('로그인 후 이용가능한 서비스입니다'); </script>");
		   out.flush();
	   }
      return urlResult;
   }
   
   @RequestMapping(value = "/Lcircle", method = RequestMethod.GET)
   public String Lcircle(HttpServletRequest req, HttpServletResponse res) throws IOException {
	   String urlResult;
	   HttpSession session = req.getSession();
	   String mem = (String)session.getAttribute("member");
	   String admin = (String)session.getAttribute("admin");
	   if(mem != null || admin != null) {
		   urlResult = "L";
	   }else {
		   urlResult = "sign_in";
		   res.setContentType("text/html; charset=euc-kr");
		   PrintWriter out = res.getWriter();
		   out.println("<script>alert('로그인 후 이용가능한 서비스입니다'); </script>");
		   out.flush();
	   }
      return urlResult;
   }   
   
   @RequestMapping(value = "/mining", method = RequestMethod.GET)
   public String mining(HttpServletRequest req, HttpServletResponse res) throws IOException {
	   String urlResult;
	   HttpSession session = req.getSession();
	   String mem = (String)session.getAttribute("member");
	   String admin = (String)session.getAttribute("admin");
	   if(mem != null || admin != null) {
		   urlResult = "mining";
	   }else {
		   urlResult = "sign_in";
		   res.setContentType("text/html; charset=euc-kr");
		   PrintWriter out = res.getWriter();
		   out.println("<script>alert('로그인 후 이용가능한 서비스입니다'); </script>");
		   out.flush();
	   }
      return urlResult;
   }
   
   @RequestMapping(value = "/mining#M%20군", method = RequestMethod.GET)
   public String miningM() {

      return "mining#M%20군";
   }
   
   @RequestMapping(value = "/mining#L%20군", method = RequestMethod.GET)
   public String miningL() {

      return "mining#L%20군";
   }
   
   @RequestMapping(value = "/", method = RequestMethod.GET)
   public String home(Locale locale, Model model) {
      
      
      return "Main";
   }
   
   @RequestMapping(value = "/sign_in", method = RequestMethod.GET)
   public String sign_in() {

      return "sign_in";
   }

   @RequestMapping(value = "/Main", method = RequestMethod.GET)
   public String Main() {

      return "Main";
   }
   
   @RequestMapping(value = "/sign_in", method = RequestMethod.POST)
   public String sign_in(String id, String pw, HttpServletRequest req, RedirectAttributes rttr) {
      int Check = memService.loginOk(id, pw);
      String loginResult;
      HttpSession session = req.getSession();      
      if(Check == 1) {
         session.setAttribute("member", id);
         loginResult = "redirect:/";
      }else if(Check == 2) {
         session.setAttribute("admin", "admin");
         loginResult = "redirect:/";
      }else if(Check == 3) {         
         rttr.addFlashAttribute("pwError", false);
         loginResult = "redirect:sign_in";
      }else {         
         rttr.addFlashAttribute("Error", false);
         loginResult = "redirect:sign_in";
      }               
      return loginResult;
   }
   
   @RequestMapping(value = "/logout", method = RequestMethod.GET)
   public String logout(HttpSession session) {
	   
	   session.invalidate();
      return "redirect:/";
   }
   
   
   @RequestMapping(value = "/sign_up", method = RequestMethod.GET)
   public String sign_up() {

      return "sign_up";
   }
   
   
   
   @RequestMapping(value = "/insert", method = RequestMethod.POST)
   public String insertMem(MemVO mem,Model model) {
      
      memService.insertMem(mem);
      
      return "sign_in";
   }
   
   
   @RequestMapping(value = "/insertboard", method = RequestMethod.POST)
   public String insertBoard(BoardVO board) {
	  int num=boardService.selectMax();
	  num=num+1;
	  System.out.println(num);
	  board.setNo(num);
      boardService.insertBoard(board);
      
      
      return "redirect:/board";
   }
   
   @RequestMapping(value = "/updateboard", method = RequestMethod.POST)
   public String updateboard(BoardVO board) {
	   System.out.println(board.getNo());//확인용
	   boardService.updateBoard(board);
	   
	   return "redirect:/board";
   }
   
   @RequestMapping(value = "/write", method = RequestMethod.GET)
   public String write() {

      return "write";
   }
   
   @RequestMapping(value="/content", method = RequestMethod.GET)
   public void getContent(Model model,int no) {
	  
      BoardVO board=boardService.getContent(no);
      model.addAttribute("board",board);
//      return "content";
   }
   
   @RequestMapping(value = "/board", method = RequestMethod.GET)
   public String board(Model model, Criteria cri) {
	   
     List<BoardVO> list=boardService.getListPaging(cri);
     model.addAttribute("list",list);
     
     int total = boardService.countBoard();
     
     PageVO pageInfo = new PageVO(cri, total);
     model.addAttribute("page", pageInfo);
    		      
      return "board";
   }
   
   @RequestMapping(value = "/modify", method = RequestMethod.GET)
   public void modify(Model model,int no) {
	   System.out.println(no);//확인용

	   BoardVO board=boardService.getContent(no);
	   model.addAttribute("board",board);
	   
   }

   @RequestMapping(value="/delete", method = RequestMethod.GET)
   public String getdeleteBoard(@RequestParam("no") int no) throws Exception {
      boardService.deleteBoard(no);
      return "redirect:/board";
   }
   
   
   @RequestMapping(value = "/down", method = RequestMethod.GET)
   public String down() {

      return "down";
   }
   
   
   


   
   
}