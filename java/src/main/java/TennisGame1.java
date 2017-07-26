
public class TennisGame1 implements TennisGame {
    
    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            m_score1 += 1;
        else
            m_score2 += 1;
    }

    public String getScore() {
        String score = "";
        int tempScore = 0;
        if (m_score1==m_score2)
        {
            String[] scoreLove = {"Love-All", "Fifteen-All", "Thirty-All", "Deuce"};
            if (m_score1==m_score2)
            {   if(m_score1 <= 2 )
                    score = scoreLove[m_score1];
                else
                    score = scoreLove[3];
            }
        }
        else if (m_score1>=4 || m_score2>=4)
        {
            int minusResult = m_score1-m_score2;
            if (minusResult==1) score ="Advantage "+player1Name;
            else if (minusResult == -1) score ="Advantage "+player2Name;
            else if (minusResult >=2 ) score = "Win for "+player1Name;
            else score ="Win for "+player2Name;
        }
        else
        {
            String[] scorePoint = {"Love", "Fifteen", "Thirty", "Forty"};
            score = scorePoint[m_score1]+"-"+scorePoint[m_score2];
        }
        return score;
    }
}
