package practice.ch22.command;

import java.util.ArrayDeque;
import java.util.Deque;

public class MacroCommand implements Command {
    // 명령의 배열 
    private Deque<Command> commands = new ArrayDeque<>();//어레이덱

    // 실행 
    @Override
    public void execute() {
        for (Command cmd: commands) {
            cmd.execute(); //리커시브호출 
        }
    }

    // 추가 
    public void append(Command cmd) {
        if (cmd == this) {
            throw new IllegalArgumentException("infinite loop caused by append");
        }
        commands.push(cmd);
    }

    // 마지막 명령을 삭제
    public void undo() {
        if (!commands.isEmpty()) {
            commands.pop(); //나중에 들어온 명령을 꺼내라.
        }
    }

    // 전부 삭제 
    public void clear() {
        commands.clear();
    }
}
