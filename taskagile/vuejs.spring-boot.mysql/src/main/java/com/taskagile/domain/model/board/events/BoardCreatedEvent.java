package com.taskagile.domain.model.board.events;

import com.taskagile.domain.common.event.DomainEvent;
import com.taskagile.domain.model.board.Board;

import lombok.Getter;

@Getter
public class BoardCreatedEvent extends DomainEvent {

  private static final long serialVersionUID = -8698981115023240376L;

  private Board board;

  public BoardCreatedEvent(Object source, Board board) {
    super(source);
    this.board = board;
  }
}
