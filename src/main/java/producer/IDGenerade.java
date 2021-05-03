package producer;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class IDGenerade {

    public long getNewID(){
        return System.nanoTime();
    }
}
