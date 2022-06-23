import { Tweet } from "./components/Tweet"
import {useState} from 'react';


function App() {
  const [tweets, setTweets] = useState<string[]>([
    'tweet1',
    'tweet2',
    'tweet3',
  ]);

  function createTweet() {
    setTweets([...tweets, 'tweet5'])
  }

  return (
  <>
    {tweets.map(tweet => {
      return <Tweet text={tweet}/>
    })}
    <button onClick={createTweet}>Adiconar Tweet</button>
  </>
  )
}

export default App
