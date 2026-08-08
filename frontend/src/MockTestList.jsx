import { useState } from 'react';

function MockTestList({ onSelectTest }) {
  const [tests, setTests] = useState([]);
  const [title, setTitle] = useState('');

  const handleCreateTest = () => {
    if (!title.trim()) return;

    const newTest = {
      id: Date.now(),
      title: title.trim(),
      questions: [
        {
          id: 1,
          text: 'What is the capital of France?',
          options: ['Berlin', 'Madrid', 'Paris', 'Rome'],
        },
        {
          id: 2,
          text: 'What is 7 + 5?',
          options: ['10', '11', '12', '13'],
        },
      ],
    };

    setTests([...tests, newTest]);
    setTitle('');
    onSelectTest(newTest); // auto-select the newly created test
  };

  return (
    <div>
      <h2>Mock Tests</h2>

      <input
        type="text"
        placeholder="Test title"
        value={title}
        onChange={(e) => setTitle(e.target.value)}
      />
      <button onClick={handleCreateTest}>Create Test</button>

      <ul>
        {tests.map((test) => (
          <li key={test.id}>
            {test.title}{' '}
            <button onClick={() => onSelectTest(test)}>Open</button>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default MockTestList;