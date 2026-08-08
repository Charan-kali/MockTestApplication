import { useState } from 'react';

function QuestionPanel({ test }) {
  const [currentIndex, setCurrentIndex] = useState(0);
  const [selected, setSelected] = useState(null);

  if (!test) {
    return <p>No question to display.</p>;
  }

  const questions = test.questions || [];
  const question = questions[currentIndex];

  if (!question) {
    return <p>No question to display.</p>;
  }

  const handleOptionClick = (option) => {
    setSelected(option);
  };

  const handleNext = () => {
    setSelected(null);
    setCurrentIndex((i) => Math.min(i + 1, questions.length - 1));
  };

  const handlePrev = () => {
    setSelected(null);
    setCurrentIndex((i) => Math.max(i - 1, 0));
  };

  return (
    <div>
      <h2>{test.title}</h2>
      <p>
        Question {currentIndex + 1} of {questions.length}
      </p>
      <h3>{question.text}</h3>

      <div>
        {question.options.map((option, index) => (
          <div key={index}>
            <button
              onClick={() => handleOptionClick(option)}
              style={{
                fontWeight: selected === option ? 'bold' : 'normal',
              }}
            >
              {option}
            </button>
          </div>
        ))}
      </div>

      <div style={{ marginTop: '10px' }}>
        <button onClick={handlePrev} disabled={currentIndex === 0}>
          Previous
        </button>{' '}
        <button
          onClick={handleNext}
          disabled={currentIndex === questions.length - 1}
        >
          Next
        </button>
      </div>
    </div>
  );
}

export default QuestionPanel;