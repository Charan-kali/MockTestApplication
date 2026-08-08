const BASE = '/api';

// Mock Tests
export const getAllTests = () => fetch(`${BASE}/mocktests`).then(r => r.json());
export const getTestById = (id) => fetch(`${BASE}/mocktests/${id}`).then(r => r.json());
export const createTest = (test) =>
  fetch(`${BASE}/mocktests`, {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(test)
  }).then(r => r.json());
export const updateTest = (id, test) =>
  fetch(`${BASE}/mocktests/${id}`, {
    method: 'PUT',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(test)
  }).then(r => r.json());
export const deleteTest = (id) =>
  fetch(`${BASE}/mocktests/${id}`, { method: 'DELETE' }).then(r => r.text());

// Questions
export const getAllQuestions = () => fetch(`${BASE}/questions`).then(r => r.json());
export const getQuestionById = (id) => fetch(`${BASE}/questions/${id}`).then(r => r.json());
export const addQuestion = (testId, question) =>
  fetch(`${BASE}/questions/${testId}`, {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(question)
  }).then(r => r.json());
export const deleteQuestion = (id) =>
  fetch(`${BASE}/questions/${id}`, { method: 'DELETE' }).then(r => r.text());

// Options
export const addOption = (questionId, option) =>
  fetch(`${BASE}/options/${questionId}`, {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(option)
  }).then(r => r.json());