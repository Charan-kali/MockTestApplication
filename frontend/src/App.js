import { useState } from 'react';
import MockTestList from './MockTestList';
import QuestionPanel from './QuestionPanel';

function App() {
  const [selectedTest, setSelectedTest] = useState(null);

  return (
    <div style={{ padding: '20px', fontFamily: 'sans-serif' }}>
      <h1>Mock Test Manager</h1>
      <MockTestList onSelectTest={setSelectedTest} />
      <hr />
      <QuestionPanel test={selectedTest} />
    </div>
  );
}

export default App;