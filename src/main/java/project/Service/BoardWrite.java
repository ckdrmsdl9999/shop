package project.Service;

import org.springframework.data.domain.PageRequest;
import org.springframework.transaction.annotation.Transactional;
import project.Repository.BoardRepository;
import project.domain.Board;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardWrite {


//    BoardRepository boardRepository = new BoardRepository();
//
//  //  boardRepository.save();
//
//    private static final int BLOCK_PAGE_NUM_COUNT = 5; // 블럭에 존재하는 페이지 번호 수
//    private static final int PAGE_POST_COUNT = 4; // 한 페이지에 존재하는 게시글 수

//    @Transactional
//    public List<BoardDto> getBoardlist(Integer pageNum) {
//        Page<BoardEntity> page = boardRepository.findAll(PageRequest.of(pageNum - 1, PAGE_POST_COUNT, Sort.by(Sort.Direction.ASC, "createdDate")));
//
//        List<BoardEntity> boardEntities = page.getContent();
//        List<BoardDto> boardDtoList = new ArrayList<>();
//
//        for (BoardEntity boardEntity : boardEntities) {
//            boardDtoList.add(this.convertEntityToDto(boardEntity));
//        }
//
//        return boardDtoList;
//    }
//
//    @Transactional
//    public Long getBoardCount() {
//        return boardRepository.count();
//    }
//
//    public Integer[] getPageList(Integer curPageNum) {
//        Integer[] pageList = new Integer[BLOCK_PAGE_NUM_COUNT];
//
//// 총 게시글 갯수
//        Double postsTotalCount = Double.valueOf(this.getBoardCount());
//
//// 총 게시글 기준으로 계산한 마지막 페이지 번호 계산 (올림으로 계산)
//        Integer totalLastPageNum = (int)(Math.ceil((postsTotalCount/PAGE_POST_COUNT)));
//
//// 현재 페이지를 기준으로 블럭의 마지막 페이지 번호 계산
//        Integer blockLastPageNum = (totalLastPageNum > curPageNum + BLOCK_PAGE_NUM_COUNT)
//                ? curPageNum + BLOCK_PAGE_NUM_COUNT
//                : totalLastPageNum;
//
//// 페이지 시작 번호 조정
//        curPageNum = (curPageNum <= 3) ? 1 : curPageNum - 2;
//
//// 페이지 번호 할당
//        for (int val = curPageNum, idx = 0; val <= blockLastPageNum; val++, idx++) {
//            pageList[idx] = val;
//        }
//
//        return pageList;
//    }

}
