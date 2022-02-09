package com.java.boostproject.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.java.boostproject.model.BoardVO;
import com.java.boostproject.model.Criteria;

@Repository
public class BoardRepository implements IBoardRepository{
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	private class BoardMapper implements RowMapper<BoardVO>{
	      @Override
	      public BoardVO mapRow(ResultSet rs, int count)throws SQLException{
	    	  BoardVO board=new BoardVO();
	    	  board.setNo(rs.getInt("no"));
	    	  board.setTitle(rs.getString("title"));
	    	  board.setContent(rs.getString("content"));
	    	  board.setRegi_date(rs.getString("regi_date"));
	     
	      return board;
	      }
	   }
	
	
	
	
	
	@Override
	public void insertBoard(BoardVO board) {
		String sql="insert into board (no,title,content,regi_date) values(?,?,?,sysdate)";
		// TODO Auto-generated method stub
		jdbcTemplate.update(sql,board.getNo(),board.getTitle(),board.getContent());
	}
	@Override
	public int countBoard() {
		// TODO Auto-generated method stub
		String sql="select count(*) from board";
		return jdbcTemplate.queryForObject(sql,Integer.class);
	}
	
	@Override
	public List<BoardVO> getListPaging(Criteria cri) {
		// TODO Auto-generated method stub
		String sql="select * from (select rownum num, board.* from board where rownum <= ? * ?)\r\n" + 
				"where num > (?-1) * ?";
		return jdbcTemplate.query(sql, new RowMapper<BoardVO> () {
			public BoardVO mapRow(ResultSet rs, int count)throws SQLException{
				BoardVO board = new BoardVO();
				board.setNo(rs.getInt("num"));
				board.setContentno(rs.getInt("no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setRegi_date(rs.getString("regi_date"));
				
				return board;
			}
		}, cri.getPageNum(), cri.getAmount(), cri.getPageNum(), cri.getAmount());
	}
		@Override
	   public BoardVO getContent(int no) {	
	      // TODO Auto-generated method stub
	      String sql="select no,title,content,regi_date from board where no= ?";
	      return jdbcTemplate.queryForObject(sql,new BoardMapper(),no);
	   }
	   @Override
	   public Object selectMax() {
	      // TODO Auto-generated method stub
	      String sql="select max(no) from board";
	      
	      return jdbcTemplate.queryForObject(sql,Object.class);
	      
	   }
	@Override
	public void updateBoard(BoardVO board) {
		// TODO Auto-generated method stub
		String sql="update board set title=?,content=? where no=?";
		System.out.println(board.getContent());
		System.out.println(board.getNo());
		
		jdbcTemplate.update(sql,board.getTitle(),board.getContent(),board.getNo());
		
	}
	
	@Override
    public void deleteBoard(int no) {
       String sql="delete from board where no=?";
       // TODO Auto-generated method stub
       jdbcTemplate.update(sql,no);
             
       
    }
	   
}
